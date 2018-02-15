import java.util.Arrays;
import java.util.ArrayList;

/**
	estas son notas personales basado en el codigo de https://github.com/ivan-liljeqvist/SimpleBlockchain
	para entender como se crea una blockchain

*/

public class Blockchain{

	public static void main(String[] args){
		ArrayList<Block> blockChain = new ArrayList<Block>(); //generamos un arrayList para asi tener los bloques en cadena 

		String[] genesisTransactions = {"satoshi envia 10 bitcoins a ivan","juan envia 200 bitcoin a ivan"};
		Block genesisBlock = new Block(0,genesisTransactions); //el primer bloque como no tiene un bloque anterior el hash anterior va a ser 0
		blockChain.add(genesisBlock); //añadimos el primer bloque a la cadena de bloques (blockchain)

		String[] secondTransaction = {"ivan envia 10 bitcoin a satoshi","satoshi envia 200 bitcoin a juan"};
		Block block = new Block(genesisBlock.getBlockHash(), secondTransaction);
		blockChain.add(block);

		for(int i=0;i<10;i++){
			String[] transactions = {"ivan envia " + (i+10) + " bitcoin a satoshi","satoshi envia "+ (50-(i+1)) +" bitcoin a juan"};
			block = new Block(block.getBlockHash(), transactions);
			blockChain.add(block);
	
		}

		for(int i=0; i<blockChain.size();i++){
			if(i==0){
				System.out.println("firma digital (hash) del bloque genesis: " + blockChain.get(i).getBlockHash());
			}
			else{
				System.out.println("firma digital (hash) del bloque "+ (i+1) +": "+ blockChain.get(i).getBlockHash());
			}
		}
	
	}
}
