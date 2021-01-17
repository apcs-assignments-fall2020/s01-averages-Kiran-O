public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double ynk = 0;
        double jkl = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                ynk += mat[row][col];
                jkl++;
            }
        }
        return ynk/jkl;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] qwe = new double[mat.length * mat[0].length];
        int ynk = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                qwe[ynk]= mat[row][col];
                ynk++;
            }
        }
        if (qwe.length % 2!= 0){
            return qwe[qwe.length/2];
        }
        else{
            return (qwe[qwe.length/2 - 1] + qwe[qwe.length/2])/2;
        }
        
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double[] qwe = new double[mat.length * mat[0].length];
        double jkl = 0;
        int ynk = 0;
        int goba = 0;
        
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                qwe[ynk]= mat[row][col];
                ynk++;
            }
        }

        for(int row = 0; row < qwe.length; row++){
            int c = 0;
            for(int col = 0; col < qwe.length; col++){
                if (qwe[row] == qwe[col]){
                    c++;
                    if (c > jkl){
                        jkl = c-1;
                        jkl = qwe[row];
                    }
                }
            }
        }
        return jkl;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
