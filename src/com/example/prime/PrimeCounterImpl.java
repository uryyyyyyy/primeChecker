package com.example.prime;

import static com.example.checkUtil.NumberFormatChecker.*;

import java.util.ArrayList;
import java.util.List;

public class PrimeCounterImpl implements PrimeCounter{

	/** アルゴリズムの問題ではないと思っているので、
	 * http://qiita.com/Liberty/items/9514f3c29f2ffb5019d5
	 * のアルゴリズムを流用しました。コメントもそのままです。
	 */
	@Override
	public int countPrimeNumber(Integer maxRange) {
		checkNotNull(maxRange);
		checkNotNegative(maxRange);
		maxRange = (maxRange - 3) / 2;
		List<Boolean> primeList = new ArrayList<Boolean>(maxRange);
		for (int i = 0; i < maxRange; i++) {
			primeList.add(true); // trueは素数扱いで管理する。（最初は全て素数として管理）
		}
		int count = 1; // 2の分をカウント
		for (int i = 0; i < maxRange; i++) {
			// primeList[i] == 0 の場合は素数ではないため演算しない
			if (primeList.get(i) == true) {
				int primeNum = i + i + 3;
				// 遅くなるのでコメントアウト
				// System.out.println("PrimeNumber -> " + primeNum);
				count++;
				// 素数と判定した場合、素数を計算対象範囲（num)になるまで
				// 足しあげていき、素数ではない数値として判断する
				// これを行うことで、例えば、 3, 6, 9, 12 ... num
				// の数値に対して余分な演算を行わないようにしている
				for (int j = i + primeNum; j < maxRange; j += primeNum) {
					primeList.set(j, false);// 素数でないのでFalse。（最初は全て素数として管理）
				}
			}
		}
		return count;
	}
}
