package calculator;
public class Calculator {
    /**
     *
     * @param w The width of the screen
     * @param h The height of the screen
     * @return The function gets the MCD between the width and height and returns it.
     */
    public static float getMcd(float w, float h){
        float width= w, height = h, mcd = 1;
        // Here we check if the height is larger than the width, and if so, we change positions
        if(height>width){
            float aux = width;
            width = height;
            height = aux;
        }
        // This while cycle gets the mcd between the height and width, so we can simplify it
        while(height!=0) {
            mcd = height;
            height = width % height;
            width = mcd;
        }
        return mcd;
    }

    /**
     *
     * @param w The width of the screen
     * @param h The height of the screen
     * @return The function returns to you the aspect ratio of your screen.
     */
    public static String simplify(float w, float h){
        float mcd= getMcd(w, h);
        w = w /mcd;
        h = h / mcd;
        return "Your aspect ratio is = " + w +" : " + h;
    }
}
