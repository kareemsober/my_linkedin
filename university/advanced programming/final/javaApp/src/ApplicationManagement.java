import java.util.Collections;

public class ApplicationManagement {
    public void addTrack(Track track,Student student){
        if(student.isInterviewConducted()==true && track.getAllAppliedStudents().size()<track.getMaxNumberOfStudents()){
            student.getProgram().getTracks().add(track);
            track.getAllAppliedStudents().add(student);
            System.out.println("Track is successfully added");
        }
        else{
            System.out.println("Adding Track Failed");
        }
    }
    public void removeTrack(Track track,Student student){
        student.getProgram().getTracks().remove(track);
        track.getAllAppliedStudents().remove(student);
        System.out.println("Successfully removed");
    }
    public void selectPriority(int wantedTrackIndex,int priorityIndex,Student student){
        Collections.swap(student.getProgram().getTracks(),wantedTrackIndex,priorityIndex);
        System.out.println("Successfully replaced");
    }
}
