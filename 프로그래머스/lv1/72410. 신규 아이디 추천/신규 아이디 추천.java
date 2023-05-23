class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        
        while (new_id.contains(".."))
            new_id = new_id.replace("..",".");
        
        int len = new_id.length();
        if (len != 0) {
            if (new_id.indexOf(".") == 0)
                new_id = new_id.replaceFirst(".", "");
            if (new_id.lastIndexOf(".") == len - 1)
                new_id = new_id.substring(0, len - 1);
        }
        
        len = new_id.length();
        if (len == 0)
            return "aaa";
        
        if (len >= 16)
            new_id = new_id.substring(0, 15);
        len = new_id.length();
        if (new_id.lastIndexOf(".") == len - 1)
            new_id = new_id.substring(0, len - 1);
        
        len = new_id.length();
        if (len <= 2)
            new_id = new_id + new_id.split("")[len - 1].repeat(3 - len);
        
        return new_id;
    }
}