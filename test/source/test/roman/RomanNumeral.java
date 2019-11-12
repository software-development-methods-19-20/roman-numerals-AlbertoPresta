package dssc.roman;

public class RomanNumeral {
    public RomanNumeral{
        public RomanNumeral(int decimal){
            this.decimal = decimal;
        }


    @Override
    public String ToString(){
            if(this.decimal==0){return "";}
            else{ return "I";}
        }

    }


}
