package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("U:/git/picture-lab-joerinic000/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("U:\\git\\picture-lab-joerinic000\\images\\snowman.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("U:\\git\\picture-lab-joerinic000\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("U:\\git\\picture-lab-joerinic000\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("U:\\git\\picture-lab-joerinic000\\images\\swan.jpg");
    swan.edgeDetection(15);
    swan.explore();
  }
  
  private static void testKeepOnlyBlue() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  private static void testNegate() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
	}
  
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("U:\\git\\picture-lab-joerinic000\\images\\snowman.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testGrayscale() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\beach.jpg");
	  beach.explore();
	  beach.greyscale();
	  beach.explore();
	}
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("U:/git/picture-lab-joerinic000/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  public static void testMirrorRightToLeft() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorRightToLeft();
	  beach.explore();
	}
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\snowman.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
	}
  
  public static void testMirrorArms() {
	  Picture snowman = new Picture("U:\\git\\picture-lab-joerinic000\\images\\snowman.jpg");	  
	  snowman.explore();
	  snowman.mirrorArms(snowman,  135, 100, 0, 100);
	  snowman.explore();
  }
  
  public static void testCopy2() {
	  Picture beach = new Picture("U:\\git\\picture-lab-joerinic000\\images\\snowman.jpg");
	  beach.explore();
	  beach.copy2(beach, 0, 15, 5, 123);
	  beach.explore(); 
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy2();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMirrorRightToLeft();
	//testMirrorHorizontalBotToTop();
  }
}