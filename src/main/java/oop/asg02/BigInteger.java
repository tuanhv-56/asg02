public class BigInteger
{
	public int val;
	
    public BigInteger(int init) {
        val = init;
    }

    public BigInteger(String init) {
        val = Integer.parseInt(init);
    }

    public String toString() {
        String s = val + "";
        return s;
    }

    public boolean equals(Object other) {
        return toString().equals(other.toString());
    }

    public long toLong() {
        return val;  
    }

    public BigInteger add(BigInteger other) {
		int tam;
		tam = this.val + other.val;
		BigInteger tmp = new BigInteger(tam);
        return tmp; 
    }

    public BigInteger subtract(BigInteger other) {
		int tam;
		tam = this.val - other.val;
		BigInteger tmp = new BigInteger(tam);
        return tmp;   
    }
	
	public int compareTo(BigInteger other){
		int result = this.toString().compareTo(other.toString());
		return result;
	}
	
	public BigInteger clone(){
		BigInteger cre = this;
		return cre;
	}
}