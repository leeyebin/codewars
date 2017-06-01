package udemy.udemy4_5;

public class Udamy4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount count = new WordCount();
		String[] s = {"apple", "banana", "cacao"};

		count.read(s);
		System.out.println(count.getCount("apple"));

	}

}

class WordCount {
    private HashMap<String, Integer> map;

    public WordCount(){
        map = new HashMap<String, Integer>();
    }

    public void read(String[] doc) {
        for(String word: doc){
            if(!map.containsKey(word)){
                map.put(word, 0);
            }
            map.put(word, map.get(word)+1);
        }
    }

    public int getCount(String word) {
        if(map.get(word)==null){
            return 0;
        }else{
            return map.get(word);
        }
    }
}
