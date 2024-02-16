class BubbleSort {
    public static void main(String[] args) {
        int[] age = { 20, 25, 40, 26, 22, 35, 29, 35, 32, 39, 37, 36, 42, 45 };
        System.out.print("Before Sorting Age : " );
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < age.length - 1; i++) {
            for (int j = 0; j < age.length - i - 1; j++) {
                if (age[j] > age[j + 1]) {
                    int temp = age[j];
                    age[j] = age[j + 1];
                    age[j + 1] = temp;
                }
            }
        }
        
        System.out.print("After Sorting Age : ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
    }
}