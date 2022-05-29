class convertUtil {

    static convertFlag(flag: boolean) {
        if (flag == false) {
            return "未済";
        } else {
            return "済";
        }
    }

    static convertTime(time: string) {
        return this.strIns(time, 2, ':')
    }

    static strIns(str: string, idx: number, val: string) {
        var res = str.slice(0, idx) + val + str.slice(idx);
        return res;
    }
}

export default convertUtil