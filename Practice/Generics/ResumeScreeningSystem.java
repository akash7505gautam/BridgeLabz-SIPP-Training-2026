import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    protected String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract void display();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    public void display() {
        System.out.println("Software Engineer: " + candidateName);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    public void display() {
        System.out.println("Data Scientist: " + candidateName);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    public void display() {
        System.out.println("Product Manager: " + candidateName);
    }
}

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}

public class ResumeScreeningSystem {

    public static <T extends JobRole> void processResume(T resume) {
        resume.display();
    }

    public static void screenResumes(List<? extends JobRole> list) {
        for (JobRole role : list) {
            processResume(role);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> software = new Resume<>();
        software.addResume(new SoftwareEngineer("Nishant"));

        Resume<DataScientist> data = new Resume<>();
        data.addResume(new DataScientist("Rahul"));

        Resume<ProductManager> product = new Resume<>();
        product.addResume(new ProductManager("Priya"));

        screenResumes(software.getResumes());
        screenResumes(data.getResumes());
        screenResumes(product.getResumes());
    }
}