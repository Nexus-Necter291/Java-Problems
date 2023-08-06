import javax.swing.*;

class Task1 
{
    public static void main(String[] args)
    {
        String shape = args[0].toLowerCase();
        double[] dimensions = new double[(args.length) - 1];

        for (int i = 0; i < dimensions.length; i++) 
        {
            dimensions[i] = Double.parseDouble(args[i + 1]);
        }

        double area = calculate_area(shape, dimensions);
        if (area != -1)
        {
            JOptionPane.showMessageDialog(null, "Area of " + shape + " = " + area);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid shape or invalid number of arguments!");
        }
    }

    public static double calculate_area(String shape, double[] dimensions)
    {
        if (shape.equals("square") && dimensions.length == 1)
        {
            double area = dimensions[0] * dimensions[0];
            return area;
        }
        else if (shape.equals("rectangle") && dimensions.length == 2)
        {
            double area = dimensions[0] * dimensions[1];
            return area;
        }
        else if (shape.equals("triangle") && dimensions.length == 2)
        {
            double area = 0.5 * dimensions[0] * dimensions[1];
            return area;
        }
        else if (shape.equals("trapezoid") && dimensions.length == 3)
        {
            double area = 0.5 * (dimensions[0] + dimensions[1]) * dimensions[2];
            return area;
        }
        else if (shape.equals("parallelogram") && dimensions.length == 2)
        {
            double area = dimensions[0] * dimensions[1];
            return area;
        }
        else if (shape.equals("circle") && dimensions.length == 1)
        {
            double area = Math.PI * dimensions[0] * dimensions[0];
            return area;
        }
        else 
        {
            return -1;
        }
    }   
}

