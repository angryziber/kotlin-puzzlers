class Simple
{
    public string Name { get; set; }
}


class GetMeJohn
{
    private string name;

    public string Name
    {
        get { return name == "John" ? "Jaan" : name; }
    }
}
