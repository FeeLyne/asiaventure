package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.elements.structure.PieceException;
import fr.insarouen.asi.prog.asiaventure.elements.structure.Piece;


/**
* Classe representant les exceptions produites lorsque le vivant est absent de la piece.
*
* @author lavigne_paul
*
*/

public class VivantAbsentDeLaPieceException extends PieceException {
  private String msg;

  //constructeurs

/**
* Constructeur VivantAbsentDeLaPieceException de la classe de meme nom.
*
*/

  public VivantAbsentDeLaPieceException(){
	super();
  }

/**
* Constructeur VivantAbsentDeLaPieceException de la classe de meme nom.
*
* @param msg
*	Le message envoye dans l'exception.
*
*/

  public VivantAbsentDeLaPieceException(String msg){
	super(msg);
  }
}
