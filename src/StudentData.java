public class StoreMark {
    String id;
    float studScore;
    String studName;
    String className;

    float[] scoreArr = new float[10];

    void initialStoreMark(String n, String i, String c, float sc, int k){
        setStudName(n);
        setId(i);
        setClassName(c);
        setStudScore(sc,k);

    }

    void setStudName(String name){
        this.studName = name;
    }

    void setId(String id){
        this.id = id;
    }

    void setClassName(String cName){
        this.className = cName;
    }

    void setStudScore(float score, int index) {
        //int index = 0;
        this.studScore = score;
        scoreArr[index] = score;

    }

    float calcAvg(){
        float avg = 0;
        for(int i=0; i<scoreArr.length; i++){
            float total = 0;
            float val = scoreArr[i];
            total += val;
            avg = total / scoreArr.length;
        }

        return avg;
    }

    double calculateSD(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
