package pkg10093855_prog6112_exam_q1;

public class Main 
{
    public static void main(String[] args) 
    {
        String[] movies = {"Napoleon", "Oppenheimer"}; //list of movies
        int[][] sales = //2D array of movie ticket sales
        {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        //handles printing of MovieTickets 
        MovieTickets movieTickets = new MovieTickets(); 
        movieTickets.printSalesReport(movies, sales);
        movieTickets.printResults(movies, sales);
    }
}
