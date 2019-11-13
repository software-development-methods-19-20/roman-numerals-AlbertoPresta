//package dssc.roman;

public class RomanNumeral {
    private int decimal;


    public RomanNumeral(int decimal){
            this.decimal = decimal;
        }


     private String make_string(int volte,String lettera){
        return new String(new char[volte]).replace("\0", lettera);
    }

    private RomanNumeral calcola_resto(int dec){
        return new RomanNumeral(dec);
    }

    private RomanNumeral decomposizione_numero(int num){
        int scomp = (this.decimal/num)*num;
        return new RomanNumeral(scomp);
    }

    @Override
    public String toString(){
            if(this.decimal==0){return "";}
            else if(this.decimal==5 || this.decimal==4){
                return make_string(5-this.decimal,"I")+"V";}
            else if(this.decimal>5 && this.decimal<9){
                return "V"+make_string(decimal%5,"I");}
            else if(this.decimal==10 || this.decimal==9){
                return make_string(10-this.decimal,"I")+"X";}
            else if(this.decimal==50){return "L";}
            else if(this.decimal==100){return "C";}
            else if(this.decimal==500){return "D";}
            else if(this.decimal==1000){return "M";}
            else if (this.decimal==1 || this.decimal==2 || this.decimal==3){
                return make_string(decimal,"I");}
            else if ((this.decimal/1000)>0){
                RomanNumeral migliaia = decomposizione_numero(1000);
                RomanNumeral resto = calcola_resto(this.decimal - migliaia.decimal);
                return make_string(decimal/1000,"M") + resto.toString();
            }
            else if(this.decimal>899 && this.decimal<1000){
                RomanNumeral resto = calcola_resto(this.decimal - 900);
                return "CM"+ resto.toString();
            }
            else if((this.decimal/500)>0){
                RomanNumeral cinquecento =decomposizione_numero(500);
                RomanNumeral resto = calcola_resto(this.decimal - cinquecento.decimal);
                return make_string(decimal/500,"D") + resto.toString();
            }
            else if(this.decimal>400 && this.decimal<500){
                RomanNumeral resto = calcola_resto(this.decimal - 400);
                return "CD"+ resto.toString();
            }
            else if((this.decimal/100)>0 ){
                RomanNumeral centinaia = decomposizione_numero(100);
                RomanNumeral resto = calcola_resto(this.decimal -centinaia.decimal);
                return make_string(decimal/100,"C") + resto.toString();
            }
            else if(this.decimal>89 && this.decimal<100){
                RomanNumeral resto = calcola_resto(this.decimal - 90);
                return "XC"+ resto.toString();
            }
            else if((this.decimal/50)>0){
                RomanNumeral cinquantina = decomposizione_numero(50);
                RomanNumeral resto = calcola_resto(this.decimal - cinquantina.decimal);
                return make_string(decimal/50,"L") + resto.toString();
            }
            else if (this.decimal>39 && this.decimal<50){
                RomanNumeral resto = calcola_resto(this.decimal - 40);
                return "XL" + resto.toString();
            }
            else{
                RomanNumeral decine = decomposizione_numero(10);
                RomanNumeral resto = calcola_resto(this.decimal - decine.decimal);
                return make_string(decimal/10,"X") + resto.toString();
            }
        }

        public static void main(String[] args) {
            RomanNumeral prova = new RomanNumeral(523);
            System.out.print(prova.toString());






    }
}







