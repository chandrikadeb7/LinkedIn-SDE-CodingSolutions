public static boolean match(int[] arr, int k) {
    for(int value : arr) {
        if(value != 0 && value != k)
            return false;
    }
    return true;
}

public static int perfectSubstring(String s, int k) {
    //Write your code here
    int ans = 0;

    for(int i = 0; i < s.length(); i++) {
        int[] arr = new int[10];

        for(int j = i; j < s.length(); j++) {
            if(j > i + (10 * k))
                break;

            char c = s.charAt(j);
            arr[c - '0']++;

            if(match(arr, k))
                ans++;
        }
    }
    return ans;
}