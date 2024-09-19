class Artist
{
private String name;
Artist(String name)
{
this.name=name;
}
public String getname()
{
return name;
}
public void display()
{
System.out.println("Artist name:"+name);
}
}