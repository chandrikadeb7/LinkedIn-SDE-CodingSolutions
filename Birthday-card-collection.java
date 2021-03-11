static List<Integer> hackerCards(List<Integer> collection, int d) {
    List<Integer> res = new ArrayList();
    int s, e;
    for(int index = 0; index <= collection.size(); index++) {
        if(index == 0)
            s = 1;
        else
            s = collection.get(index-1) + 1;
        if(index != collection.size())
            e = collection.get(index);
        else
            e = Integer.MAX_VALUE;
        if(d < s)
            break;
        for(int k = s; k < e; k++) {
            if(k <= d) {
                res.add(k);
                d-=k;
            }
            else
                break;
        }
    }
    return res;
}