    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
class VersionControl {
    int bad = 4; // example bad version

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid))
            {
               high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}

