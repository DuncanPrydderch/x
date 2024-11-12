package pkg10093855_prog6112_exam_q1;

public class MovieTickets implements IMovieTickets 
{
    public void printSalesReport(String[] movies, int[][] sales) 
    {
        System.out.println("MOVIE TICKET SALES REPORT - 2024\n");
        System.out.printf("%28s %13s %13s%n", "JAN", "FEB", "MAR");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < sales.length; i++) 
        {
            System.out.printf("%-15s", movies[i]);
            for (int j = 0; j < sales[i].length; j++) 
            {
                System.out.printf("%14d", sales[i][j]);
            }
            System.out.println();
        }
    }
    @Override
    public int TotalMovieSales(int[] movieTicketSales) //calulates total sales per movie
    {
        int total = 0;
        for (int sales : movieTicketSales) 
        {
            total += sales;
        }
        return total;
    }
    @Override
    public String TopMovie(String[] movies, int[] totalSales) //finds + prints movie with highest sales
    {
        int maxSales = 0;
        String topMovie = "";

        for (int i = 0; i < totalSales.length; i++) 
        {
            if (totalSales[i] > maxSales) 
            {
                maxSales = totalSales[i];
                topMovie = movies[i];
            }
        }

        return topMovie;
    }

    public void printResults(String[] movies, int[][] sales) //prints the total for each movei, as well as the top movie
    {
        System.out.println();
        int[] totalSales = new int[sales.length];

        for (int i = 0; i < sales.length; i++) 
        {
            totalSales[i] = TotalMovieSales(sales[i]);
            System.out.printf("Total movie ticket sales for %s: %d%n", movies[i], totalSales[i]);
        }

        String topMovie = TopMovie(movies, totalSales);
        System.out.println();
        System.out.println("Top Movie: " + topMovie);
    }
}
