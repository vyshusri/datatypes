package Encapsulation;

public class marks {
    private int Maths=50;
    private int Physics=30;
    private int English=45;
    
    public void getSubjects(){
        System.out.println("sub1:"+Maths);
        System.out.println("sub2:"+Physics);
        System.out.println("sub3:"+English);
    }
    public int getTotal(){
        return  Maths+Physics+English;
    }
    
    public int getAvg(){
        return getTotal()/3;
    }
    public void getGrade(){
        if(getAvg()<50){
            System.out.println("Grade:"+"A");
        }else if(getAvg()<40){
            System.out.println("Grade:"+"B");
        }else if(getAvg()<30){
            System.out.println("Grade:"+"C");
        }else{
            System.out.println("Grade:"+"F");
        }

        }

        }
    
        