package com.leetcode.problems.problems_050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {

    public static void main(String[] args) {
        
    }
    
    /**
     * LeetCode39. 组合总和
     * 
     * 学习  深度搜索   dfs
     * 
     * 
     * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
                         candidates 中的数字可以无限制重复被选取。
                        说明：
                        所有数字（包括 target）都是正整数。
                        解集不能包含重复的组合。 
                        示例 1:
                        输入: candidates = [2,3,6,7], target = 7,
                        所求解集为:
                        [
                          [7],
                          [2,2,3]
                        ]
                        示例 2:
                        输入: candidates = [2,3,5], target = 8,
                        所求解集为:
                        [
                          [2,2,2,2],
                          [2,3,3],
                          [3,5]
                        ]
                        来源：力扣（LeetCode）
                        链接：https://leetcode-cn.com/problems/combination-sum
                        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        Arrays.sort(candidates); // 剪枝
        dfs(candidates, resultList, result, 0, target);
        return resultList;
    }

    private void dfs(int[] candidates, List<List<Integer>> resultList, List<Integer> result, int start, int target) {
        if (target < 0){            // target不符合
            return;
        }else if (target == 0){   // target符合
            resultList.add(new ArrayList<>(result));
        }else {                  // 继续进行数的查找
            
            for (int i = start; i < candidates.length; i++){
                if (target - candidates[i] >= 0){
                    result.add(candidates[i]);
                    dfs(candidates, resultList, result, i, target - candidates[i]);
                    result.remove(result.size() - 1);     // 数查找完后要进行回溯
                }else {
                    break;
                }
            }
        }
    }
}

	