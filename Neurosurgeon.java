
public class Neurosurgeon extends Surgeon{
    private String education;

    public Neurosurgeon(int work_experience, String education) {
        this.work_experience = work_experience;
        this.education = education;
    }

    @Override
    public void getwork_experience() {
        System.out.println("Work experience: " + work_experience + " years.");
    }

    public String geteducation() {
        return education;
    }
}