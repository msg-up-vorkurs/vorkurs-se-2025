void main() {

    /* if (<Bedingung>) {
     * <Anweisungen, wenn Bedingung wahr>
     * } else if (<Andere Bedingung>){                          -> optional
     * <Anweisungen, wenn andere Bedingung wahr>
     * } else {                                                 -> optional
     * <Anweisungen, wenn alle vorherigen Bedingungen falsch>
     * }
     */

    boolean isWeatherNice = true;
    boolean isWeatherMediocre = true;
    if(isWeatherNice){
        IO.println("Das Wetter ist schön");
    } else if(isWeatherMediocre){
        IO.println("Das Wetter ist mittelmäßig");
    } else {
        IO.println("Das Wetter ist nicht schön");
    }

    // |

    int number = 5;
    if(number < 10 & number > 2){
        IO.println("Die Zahl ist kleiner zehn und größer als zwei");
    }



    IO.println("Programmende");


}
