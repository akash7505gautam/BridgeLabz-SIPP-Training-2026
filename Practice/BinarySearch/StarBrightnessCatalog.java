class StarBrightnessCatalog {


static int binarySearch(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;

while (left <= right) {
int mid = left + (right - left) / 2;

if (arr[mid] == target) {
return mid;
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}

return -1;
}

static int searchRotated(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;

while (left <= right) {
int mid = left + (right - left) / 2;

if (arr[mid] == target) {
return mid;
}

if (arr[left] <= arr[mid]) {
if (target >= arr[left] && target < arr[mid]) {
right = mid - 1;
} else {
left = mid + 1;
}
} else {
if (target > arr[mid] && target <= arr[right]) {
left = mid + 1;
} else {
right = mid - 1;
}
}
}

return -1;
}

static int firstOccurrence(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;
int result = -1;

while (left <= right) {
int mid = left + (right - left) / 2;

if (arr[mid] == target) {
result = mid;
right = mid - 1;
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}

return result;
}

static int lastOccurrence(int[] arr, int target) {
int left = 0;
int right = arr.length - 1;
int result = -1;

while (left <= right) {
int mid = left + (right - left) / 2;

if (arr[mid] == target) {
result = mid;
left = mid + 1;
} else if (arr[mid] < target) {
left = mid + 1;
} else {
right = mid - 1;
}
}

return result;
}

static int findMinimum(int[] arr) {
int left = 0;
int right = arr.length - 1;

while (left < right) {
int mid = left + (right - left) / 2;

if (arr[mid] > arr[right]) {
left = mid + 1;
} else {
right = mid;
}
}

return arr[left];
}

public static void main(String[] args) {
int[] arr = {1, 2, 3, 3, 3, 4, 5};

System.out.println("Target Index: " + binarySearch(arr, 3));
System.out.println("First Occurrence: " + firstOccurrence(arr, 3));
System.out.println("Last Occurrence: " + lastOccurrence(arr, 3));

int[] rotated = {4, 5, 6, 7, 1, 2, 3};

System.out.println("Rotated Search Index: " + searchRotated(rotated, 2));
System.out.println("Minimum Brightness: " + findMinimum(rotated));
}
}