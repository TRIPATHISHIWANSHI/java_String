//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution {
    public int strStr(String haystack, String needle) {
    int index=haystack.indexOf(needle);
    if(index!=-1)
    return index;
    else
    return -1;
}
}
