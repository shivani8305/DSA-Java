class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];
        int i=0;
        if(k<len)
        {
        int j=len-k;
        int m=k;
        while(m!=0)
        {
            arr[i]=nums[j];
            i++;
            j++;
            m--;
        }
        int b=0;
        for(int a=i;a<len;a++)
        {
            arr[a]=nums[b];
            b++;
        }

        }
        else if(len==1 || k==len)
        {
            for(int x=0;x<len;x++)
            {
                arr[x]=nums[x];
            }
        }
        else if(k>len)
        {
            
            int n=k%len;
            int o=0;
            int d=len-n;
            while(n!=0)
            {
                arr[o]=nums[d];
                o++;
                d++;
                n--;
            }
            int g=0;
            for(int f=o;f<len;f++)
            {
                arr[f]=nums[g];
                g++;
            }

        }
        
        for(int c=0;c<len;c++)
        {
            nums[c]=arr[c];
        }
    
    }
}