class Solution {
    public String solution(String polynomial) {
        String[] polys = polynomial.split(" ");

        int constant = 0;
        int linear = 0;
        for (int i = 0; i < polys.length; i++) {
            if (polys[i].contains("x")) {
                int cof = 0;
                if (polys[i].equals("x")) {
                    cof += 1;
                } else {
                    String c = polys[i].split("x")[0];
                    cof = Integer.valueOf(c);
                }
                linear += cof;
            } else if (!polys[i].equals("+")) {
                constant += Integer.valueOf(polys[i]);
            }
        }

        if (linear == 0) {
            return constant + "";
        } else if (constant == 0) {
            return  (linear == 1) ? "x" : linear + "x";
        } else {
            return (linear == 1) ? "x + " + constant : linear + "x + " + constant;
        }

        //
        int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}

//
import java.util.StringTokenizer;

class Solution {
    public String solution(String polynomial) {
        StringTokenizer st = new StringTokenizer(polynomial, " + ");
        StringBuilder sb = new StringBuilder();

        int xsum = 0;
        int sum = 0;
        while (st.hasMoreTokens()) {
            String str = st.nextToken();

            if (str.contains("x")) {
                String x = str.replace("x", "");
                if (x.isBlank()) {
                    xsum += 1;
                } e;se {
                    sxum += Integer.parseInt(x);
                }
            } else {
                sum += Integer.parseInt(str);
            }
        }

        if (xsum == 0) {
            sb.append(sum);
        } else if (sum == 0) {
            if (xsum == 1) {
                sb.append("x");
            } else {
                sb.append(xsum).append("x");
            }
        } else {
            if (xsum == 1) {
                sb.append("x").append(" + ").append(sum);
            } else {
                sb.append(xsum).append("x").append(" + ").append(sum);
            }
        }

        return sb.toString();
    }