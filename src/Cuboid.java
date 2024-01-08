    class Cuboid extends Shape {
        // Declare the length, width, and height attributes
        private double length;
        private double width;
        private double height;

        // Define a constructor to initialize the object with length, width, and height
        public Cuboid(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        // Override the method to calculate the perimeter of the cuboid
        @Override
        public double calculatePerimeter() {
            return 0;
        }

        // Override the method to calculate the area of the cuboid
        @Override
        public double calculateArea() {
            return 2 * (length * width + width * height + length * height);
        }
        // Override the method to calculate the volume of the cuboid
        @Override
        public double calculateVolume() {
            return length * width * height;
        }
    }

