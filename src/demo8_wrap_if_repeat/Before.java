package demo8_wrap_if_repeat;

public class Before {
    private static final int TYPE_OBJECT = 0;

    class Type {
        final String value;
        final int type;
        final int arrayDim;

        Type(String value, int type, int arrayDim) {
            this.value = value;
            this.type = type;
            this.arrayDim = arrayDim;
        }

        @Override
        public String toString() {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < arrayDim; i++) {
                res.append('[');
            }
            if (type == TYPE_OBJECT) {
                res.append('L').append(value).append(';');
            }
            else {
                res.append(value);
            }
            return res.toString();
        }
    }
}
