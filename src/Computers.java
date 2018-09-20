import java.util.Random;
import java.util.Scanner;

public class Computers {
    private String proc;
    private int ram;
    private int hdd;
    private int resurs;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean isStart = false;


    public Computers(String proc, int ram, int hdd, int resurs) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
        this.resurs = resurs;
    }

    public Computers(){

    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResurs() {
        return resurs;
    }

    public void setResurs(int resurs) {
        this.resurs = resurs;
    }

    public void out (){
        System.out.println("Характеристики компа");
        System.out.println("Процессор - " + proc);
        System.out.println("Оперативная память -  " + ram );
        System.out.println("Жесткий диск -  " + hdd );
        System.out.println("Ресурс полных циклов работы - " + resurs);
        System.out.println();
    }

    private boolean proverka(){
        int vvod = scanner.nextInt();
        int gener = random.nextInt(2);
        if(vvod == gener){
            return true;
        }
        return false;
    }

    public void start (){
        if (isStart == false){
            if (resurs==0){
                System.out.println("Комьютер сгорел так как ресурс полных циклов работы закончился");
            }else {
                System.out.println("Для включения компьютера введите 0 или 1");
                if (proverka()) {
                    System.out.println(proc + " включился");
                    isStart = true;
                    resurs--;
                } else {
                    System.out.println(proc + " сгорел при включении");
                }
            }
        }else {
            System.out.println("Компьютер включен");
        }
    }

    public void stop(){
        if (isStart ){
            System.out.println("Для выключения компьютера нажмите 0 или 1");
            if (proverka()){
                System.out.println(proc + " выключился");
                isStart = false;
            }else{
                System.out.println(proc + " сгорел при выключении");
            }
        }else {
            System.out.println("Компьютер еще не включен");
        }

    }

}
