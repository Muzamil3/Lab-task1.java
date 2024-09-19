class Artwork
{
private String title;
private int year;
private Artist artist;
Artwork(String title, int year)
{
this.title=title;
this.year=year;
artist=UnknownArtist;
}
Artwork(String title, int year, Artist artist)
{
this.title=title;
this.year=year;
this.artist=artist;
}
public String gettitle()
{
return title;
}
public int getyear()
{
return year;
}
public Artist getartist()
{
return artist;
}
Artwork(Artwork art)
{
this.title=art.gettitle();
this.year=art.getyear();
this.artist=art.getartist();
}
public void settitle()
{
this.title=title;
}
public void setyear()
{
this.year=year;
}
public void diplayinfo()
{
System.out.println("Title:"+title);
System.out.println("Year:"+year);
artist.display();
}
}