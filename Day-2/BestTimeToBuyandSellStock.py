class BestTimeToBuyandSellStock:
    def maxProfit(self, prices: List[int]) -> int:
        minp=sys.maxsize;
        maxp=0;
        for i in range(0,len(prices)):
            if prices[i]<minp:
                minp=prices[i]
            else:
                maxp=max(maxp,prices[i]-minp)
        return maxp
        