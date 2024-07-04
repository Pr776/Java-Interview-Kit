
    class TrainingData{
        String TrainingModule;
        int Trainingid;
        int NoOfParticipants;
        String TrainingLocation;
        // constructor as a class member
        TrainingData(){
        TrainingModule="SDET-SEL";
        Trainingid=91479;
        NoOfParticipants=38;
        TrainingLocation="Bhubaneswar";
        }
        }
        public class TrainingDetails {
        public static void main(String[] args) {

        // Oject for class TrainingData
        TrainingData obj1 = new TrainingData();
        System.out.println("Training module name is: "+" "+obj1.TrainingModule);
        System.out.println("Training id is : "+" "+obj1.Trainingid);
        System.out.println("Number of participants are: "+" "+obj1.NoOfParticipants);
        System.out.println("Training Location is: "+" "+obj1.TrainingLocation);
    }
        }

