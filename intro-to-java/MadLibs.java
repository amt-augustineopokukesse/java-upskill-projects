public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Augustine
  Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Johnny";
      String adjective1 = "excited";
      String adjective2 = "great";
      String adjective3 = "good";
      String verb1 = "eat";
      String noun1 = "cat";
      String noun2 = "broom";
      String noun3 = "phone";
      String noun4 = "mouth";
      String noun5 = "shoe";
      String noun6 = "mouse";
      String name2 = "Peter";
      int number = 7;
      String place1 = "Accra";


      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
