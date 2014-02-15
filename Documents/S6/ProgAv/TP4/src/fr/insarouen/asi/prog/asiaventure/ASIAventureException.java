package fr.insarouen.asi.prog.asiaventure;

/**
* Classe representant les exceptions du jeu.
*
* @author lavigne_paul
*
*/

public class ASIAventureException extends java.lang.Exception {
  private String msg;

  //constructeurs

/**
* Constructeur ASIAventureException de la classe de meme nom.
*
*/

  public ASIAventureException(){
  }

/**
* Constructeur ASIAventureException de la classe de meme nom.
*
* @param _msg
*	Le message envoye dans l'exception.
*/

  public ASIAventureException(String _msg){
	msg=_msg;
  }


}


