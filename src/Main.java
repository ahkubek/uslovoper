public class Main {
    public static void main(String[] args) {

int age = 18;
int childrenage = 18;
int temperatura = 5;
int speed = 100;
int stoyachie = 60;
int sidyachie = 52;
int vagon=stoyachie+sidyachie;
int one = 1;
int two=2;
int three = 3;
if (one<2&& two<3){
    System.out.println(three);
}
if (childrenage<5&&childrenage<14){
    System.out.println("ребенок  может кататься на атракционе, но в сопровождении");
        }else {
    System.out.println("может кататься один");
        }
if (age>=18&&age<21){
            System.out.println("Ты совершеннолетний и тебе можно все");

        } else {
    System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }
if (temperatura<=5||temperatura>=5){
    System.out.println("холодно");
            } else {
    System.out.println ("температура нормальная");
            }
if (speed <=60){
    System.out.println("скорость допустимая");
    if (vagon <=1102){
                System.out.println("в вагоне еще есть место");
            }
} else  {
    System.out.println("вы превысили скорость");

    if (vagon <=102){
                System.out.println("в вагоне еще есть место");
            }else {
        System.out.println("в вагоне места нет");
    }
}


    }
}
