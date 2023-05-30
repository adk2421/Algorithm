import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList cache = new ArrayList();
        
        if( cacheSize == 0 )
            return cities.length * 5;
        
        for( String city : cities ) {
            city = city.toLowerCase();
            
            if( cache.contains(city) ) {
                answer++;
                String temp = cache.get(cache.indexOf(city)).toString();
                cache.remove(cache.get(cache.indexOf(city)));
                cache.add(temp);
                
            } else {
                answer += 5;
                if( cache.size() == cacheSize ) {
                    cache.remove(cache.get(0));
                }
                cache.add(city);
            }
        }
        return answer;
    }
}