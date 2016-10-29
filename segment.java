public class segment {
   private point A;
   private point B;
	
  public segment(point B){
	 A= new point();
	  this.B=B;
	  
	}
  public segment(point A,point B ){
		this.A=A;
	    this.B=B;
}
  public double distance()
    {
        
       return Math.sqrt((B.getAbscisse()-A.getAbscisse())*(B.getAbscisse()-A.getAbscisse()) +(B.getOrdonée()-A.getOrdonée())*(B.getOrdonée()-A.getOrdonée()));
        
    }
  public  segment Symetrie(){
    	return new segment(A.Symetrie(),B.Symetrie());
    }
  public String toString(){
		return A.toString()+" "+B.toString() ;
		}
}
