class MainComputer
{
    public static void main(String[] args)
    {
        Computer C = new Computer();

        System.out.println(C.Height);

        C.Color = "Black";
        C.Brand = "HP";
        C.Ram = 8;
        C.Storage = 256;
        C.MadeIn = "Sri Lanka";

        C.StudyCoding();
        C.Edit();
        C.WatchMovies();
    }
}
