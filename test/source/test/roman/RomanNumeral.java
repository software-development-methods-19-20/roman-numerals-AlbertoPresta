//package dssc.roman;

public class RomanNumeral {
    private int decimal;


        public RomanNumeral(int decimal){
            this.decimal = decimal;
        }


    @Override
    public String toString(){
            if(this.decimal==0){return "";}
            else if(this.decimal==5 || this.decimal==4){
                String repeated = new String(new char[5-this.decimal]).replace("\0", "I");
                return repeated+"V";}
            else if(this.decimal>5 && this.decimal<9){
                String repeated = new String(new char[decimal%5]).replace("\0", "I");
                return "V"+repeated;}
            else if(this.decimal==10 || this.decimal==9){
                String repeated = new String(new char[10-this.decimal]).replace("\0", "I");
                return repeated+"X";}
            else if(this.decimal==50){return "L";}
            else if(this.decimal==100){return "C";}
            else if(this.decimal==500){return "D";}
            else if(this.decimal==1000){return "M";}
            else if (this.decimal==1 || this.decimal==2 || this.decimal==3){
                String repeated = new String(new char[decimal]).replace("\0", "I");
                return repeated;}
            else if ((this.decimal/1000)>0){
                int migl =(this.decimal/1000)*1000;
                RomanNumeral migliaia = new RomanNumeral(migl);
                RomanNumeral resto = new RomanNumeral(this.decimal - migliaia.decimal);
                String repeated = new String(new char[this.decimal/1000]).replace("\0", "M");
                return repeated + resto.toString();
            }
            else if(this.decimal>899 && this.decimal<1000){
                RomanNumeral resto = new RomanNumeral(this.decimal - 900);
                return "CM"+ resto.toString();
            }
            else if((this.decimal/500)>0){
                int cinq =(this.decimal/500)*500;
                RomanNumeral cinquecento = new RomanNumeral(cinq);
                RomanNumeral resto = new RomanNumeral(this.decimal - cinquecento.decimal);
                String repeated = new String(new char[this.decimal/500]).replace("\0", "D");
                return repeated + resto.toString();
            }

            else if(this.decimal>400 && this.decimal<500){
                RomanNumeral resto = new RomanNumeral(this.decimal - 400);
                return "CD"+ resto.toString();
            }

            else if((this.decimal/100)>0 ){
                int cent =(this.decimal/100)*100; // esempio 408-->400
                RomanNumeral centinaia = new RomanNumeral(cent);
                RomanNumeral resto = new RomanNumeral(this.decimal -centinaia.decimal);
                String repeated = new String(new char[this.decimal/100]).replace("\0", "C");
                return repeated + resto.toString();
            }
            else if(this.decimal>89 && this.decimal<100){
                RomanNumeral resto = new RomanNumeral(this.decimal - 90);
                return "XC"+ resto.toString();

            }

            else if((this.decimal/50)>0){
                int cinquanta = (this.decimal/50)*50;
                RomanNumeral cinquantina = new RomanNumeral(cinquanta);
                RomanNumeral resto = new RomanNumeral(this.decimal - cinquanta);
                String repeated = new String(new char[this.decimal/50]).replace("\0", "L");
                return repeated + resto.toString();
            }
            else if (this.decimal>39 && this.decimal<50){
                RomanNumeral resto = new RomanNumeral(this.decimal - 40);
                return "XL"+ resto.toString();
            }

            else if(this.decimal/10>0){
                int dec = (this.decimal/10)*10;
                RomanNumeral decine = new RomanNumeral(dec);
                RomanNumeral resto = new RomanNumeral(this.decimal - dec);
                String repeated = new String(new char[this.decimal/10]).replace("\0", "X");
                return repeated + resto.toString();
            }
        else return "";

        }
    public static void main(String[] args) {

        RomanNumeral prova= new RomanNumeral(1565);
        System.out.println(prova.toString());
    }
}







