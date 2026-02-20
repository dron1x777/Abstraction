public enum Operation {
    PLUS {
        @Override
        public String apply(double a, double b) {
            double c = a + b;
            return a + " + " + b + " = " + c;
        }
    },
    MINUS{
        @Override
        public String apply(double a, double b) {
            double c = a - b;
            return a + " - " + b + " = " + c;
        }
    },
    MULTIPLY {
        @Override
        public String apply(double a, double b) {
            double c = a * b;
            return a + " * " + b + " = " + c;
        }
    },
    DIVIDE{
        @Override
        public String apply(double a, double b) {
            if (a == 0 || b == 0) {
                return "0";
            }
            double c = a / b;
            return a + " / " + b + " = " + c;
        }
    };


   abstract public String apply(double a, double b);

}
