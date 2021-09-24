package Controllers;

import Services.ErDetFredag;

public class FredagController {
    public static String fredag () {
    if (ErDetFredag.test() == 5){
        return "ja det er fredag";
    }else {
        return "det er ikke fredag";
    }
    }

}
