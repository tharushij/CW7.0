public class Dictionary2 extends Book2
{
    private int definitions;

    public Dictionary2 (int numPages, int numDefinitions)
    {
        super (numPages);
        definitions = numDefinitions;
    }

    public void definitionMessage()
    {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Definitions per page: " + definitions/pages);
        System.out.println("CW 7.0 - Tharushi Jayasinghe");
    }
} // end class Dictionary2
