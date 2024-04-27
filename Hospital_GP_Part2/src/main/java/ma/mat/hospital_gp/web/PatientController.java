package ma.mat.hospital_gp.web;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.mat.hospital_gp.entities.Patient;
import ma.mat.hospital_gp.repositories.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller //SpringMVC
@AllArgsConstructor //pour l'inj avc contr
public class PatientController {

    private PatientRepository patientRepository;

/*    //Constr, Pour fair l'injection via le contr ,pas via Autowired
    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }*/

    @GetMapping("/index") // ex : /index?page=0&size=3
    private String index(Model model,
                         @RequestParam(name="page",defaultValue = "0") int p,//  index?p=0&s=3
                         @RequestParam(name = "size",defaultValue = "4") int s,
                         @RequestParam(name = "keyword",defaultValue = "") String kw){
      // Page<Patient> patientsPage = patientRepository.findAll(PageRequest.of(p,s));
        Page<Patient> patientsPage = patientRepository.findByNomContains(kw,PageRequest.of(p,s));
        model.addAttribute("ListPatients",patientsPage.getContent());//Stocker ls resuts sur le Model
        model.addAttribute("pages",new int[patientsPage.getTotalPages()]);
        model.addAttribute("currentPage",p);
        model.addAttribute("keyword",kw);

        return "patients" ; //view patients.html;
    }
    @GetMapping ("/delete")//quand .../delete , la method exc
    public String delete(Long id, String keyword, int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/formPatients")
    public String formPatients(Model model){
        model.addAttribute("patient",new Patient());
        return "fromPatients";

    }
    @PostMapping("/save")
    public String Save(Model model, @Valid  Patient patient, BindingResult bindingResult,
                       @RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String keyword){
        if(bindingResult.hasErrors()) return "fromPatients";
        patientRepository.save(patient);
        return "redirect:/index?page="+page+"&keyword="+keyword;

    }

    @GetMapping("/editPatient")
    public String editPatient(Model model, Long id,String keyword, int page){
        Patient patient = patientRepository.findById(id).orElse(null);
        if(patient == null) throw new RuntimeException("Patient introuvable");
        model.addAttribute("patient",patient);
        model.addAttribute("page",page);
        model.addAttribute("keyword",keyword);
        return "editPatient";

    }
}
