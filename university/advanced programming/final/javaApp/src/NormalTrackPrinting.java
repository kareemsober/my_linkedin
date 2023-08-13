import java.net.ContentHandler;
import java.time.LocalDate;

public class NormalTrackPrinting implements TrackPrintingService {
    @Override
    public void print(Student student) {
        System.out.println("Report Title: Title "+"Student Name: "+student.englishName+"University Name: "+student.getUniversity().getEnglishName()+" School Name: "+student.getSchool().getEnglishName()+" Program Name: "+student.getProgram().getEnglishName()+" Current Date: "+ LocalDate.now());
        System.out.println("Content: ");
        int index=0;
        for (Track track:student.getProgram().getTracks()
             ) {
            System.out.println("Track Number: "+track.getId());
            System.out.println("Track Name: "+track.getEnglishName());
            System.out.println("Priority: "+index);
            index++;
            
        }
        System.out.println("Footer: ");
        double sum=0;
        for (Track track:student.getProgram().getTracks()
             ) {
            for (Assessment assessment:track.getDoneAssessments()
                 ) {
                sum+=assessment.getMark();
            }

        }
        System.out.println("Sum Of Marks: "+sum);



    }
}
