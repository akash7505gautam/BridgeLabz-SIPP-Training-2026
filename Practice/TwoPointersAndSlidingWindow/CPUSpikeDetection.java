public class CPUSpikeDetection {

static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
if (cpuLoad == null || k <= 0 || k > cpuLoad.length) {
return 0;
}

int windowSum = 0;
int maxSum = Integer.MIN_VALUE;
int start = 0;

for (int end = 0; end < cpuLoad.length; end++) {
windowSum += cpuLoad[end];

if (end >= k - 1) {
maxSum = Math.max(maxSum, windowSum);
windowSum -= cpuLoad[start];
start++;
}
}

return maxSum;
}

public static void main(String[] args) {
int[] cpuLoad = {20, 30, 50, 40, 60, 80, 10};
int k = 5;

int result = maxSubarrayOfSizeK(cpuLoad, k);

System.out.println("Maximum CPU Load: " + result);
}
}