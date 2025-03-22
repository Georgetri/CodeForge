package LeetCode;
/**Dado um array prices[], onde cada elemento representa o preço da ação em um determinado dia,
 * encontre o máximo lucro que pode ser obtido comprando em um dia anterior e vendendo em um dia posterior.
 Se não for possível obter lucro, retorne 0.
 Input: prices = [7,1,5,3,6,4]   Output: 5
 Explicação: Compra no dia 2 (preço = 1) e vende no dia 5 (preço = 6). Lucro = 6 - 1 = 5.
 Input: prices = [7,6,4,3,1]   Output: 0
 Explicação: Nenhuma transação pode gerar lucro, pois os preços sempre caem.  */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        //int[] prices = {7, 1, 5, 3, 6, 4};
        //int[] prices = {7, 6, 4, 3, 1};
         int[] prices = {2, 4, 1, 7, 5, 9, 3};

        int minPrice = Integer.MAX_VALUE; // Menor preço encontrado
        int maxProfit = 0; // Maior lucro possível
        int buyDay = -1; // Dia de compra
        int sellDay = -1; // Dia de venda
        int minPriceDay = -1; // Dia do menor preço

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Atualiza o menor preço
                minPriceDay = i; // Armazena o dia do menor preço
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; // Atualiza o maior lucro
                    buyDay = minPriceDay; // Compra no dia do menor preço
                    sellDay = i; // Vende no dia atual
                }
            }
        }

        System.out.println("Lucro máximo: " + maxProfit);
        System.out.println("Dia de compra: " + (buyDay + 1)); // +1 para exibir o dia correto (baseado em 1)
        System.out.println("Dia de venda: " + (sellDay + 1)); // +1 para exibir o dia correto (baseado em 1)
    }

}