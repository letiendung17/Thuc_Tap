public class Bai29 {
    public static void main(String[] args) {

    }

        // 1️⃣ Phương thức với 4 tham số: width, height, areaPerBucket, extraBuckets
        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1; // Giá trị không hợp lệ
            }
            double wallArea = width * height;
            int requiredBuckets = (int) Math.ceil(wallArea / areaPerBucket);
            return requiredBuckets - extraBuckets; // Số xô cần mua sau khi trừ số xô có sẵn
        }

        // 2️⃣ Phương thức với 3 tham số: width, height, areaPerBucket
        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1; // Giá trị không hợp lệ
            }
            double wallArea = width * height;
            return (int) Math.ceil(wallArea / areaPerBucket); // Số xô cần mua
        }

        // 3️⃣ Phương thức với 2 tham số: area, areaPerBucket
        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1; // Giá trị không hợp lệ
            }
            return (int) Math.ceil(area / areaPerBucket); // Số xô cần mua
        }
    }


