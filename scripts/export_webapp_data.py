#!/usr/bin/env python3
"""Export calculator dataset for the Chiikawa Pocket team webapp."""
import json, os

BASE = r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled"
MD = os.path.join(BASE, 'analysis', 'masterdata')
OUT = os.path.join(BASE, 'webapp', 'data.js')

def load(n):
    return json.load(open(os.path.join(MD, n + '.json'), encoding='utf-8'))

characters = load('Character')
costumes = load('Costume')
skills = load('HuntSkill')
effects = load('HuntSkillEffect')
lrv = load('LevelRangeValue')
lrvg = load('LevelRangeValueGroup')
tags = load('Tag')
weapons = load('Weapon')
armors = load('Armor')
assists = load('AssistSkill')
treasures = load('Treasure')
posfx = load('PossessionEffect')
costume_posfx = load('CostumePossessionEffect')
rarity = load('CostumeRarity')
status_cfg = load('HuntStatusConfig')

eff_by_id = {e['id']: e for e in effects}
lrv_by_id = {r['id']: r for r in lrv}

def skill_json(s):
    effs = []
    for eid in s['skillEffectIds']:
        e = eff_by_id.get(eid)
        if not e:
            continue
        lv = lrv_by_id.get(e['effectLevelRangeValueId'])
        effs.append({
            'type': e['skillEffectType'], 'target': e['targetType'], 'range': e['targetRangeType'],
            'calc': e['calculationType'], 'buffSec': e['buffEffectTime'],
            'condGroupId': e.get('conditionGroupId', 0),
            'lv': None if not lv else {
                't': lv['levelRangeType'], 's': lv['rangeStartLevel'], 'e': lv['rangeEndLevel'],
                'sv': lv['startValue'], 'ev': lv['endValue'], 'vt': lv['valueType'],
            },
        })
    return {'id': s['id'], 'rarity': s['rarity'], 'recastMs': s['recastTime'], 'castMs': s['skillCastTime'], 'effects': effs}

def costume_json(c):
    return {
        'id': c['id'], 'char': c['characterId'], 'rarity': c['costumeRarityId'],
        'skill': c['uniqueHuntSkillId'], 'skillCoef': c['skillCoefficient'],
        'arGroup': c['attackRateLevelRagneGroupId'], 'asGroup': c['attackSpeedLevelRagneGroupId'],
        'asType': c['attackSpeedType'], 'tags': c['tagIds'], 'sort': c['sortOrder'],
        'posFx': c['costumePossessionEffectIds'], 'promoFx': c['promotionCostumePossessionEffectId'],
    }

groups = {}
for g in lrvg:
    rows = []
    for lid in g['levelRangeValueIds']:
        r = lrv_by_id.get(lid)
        if r:
            rows.append({'t': r['levelRangeType'], 's': r['rangeStartLevel'], 'e': r['rangeEndLevel'],
                         'sv': r['startValue'], 'ev': r['endValue'], 'vt': r['valueType']})
    groups[str(g['id'])] = rows

def item_json(w, kind):
    return {'id': w['id'], 'kind': kind, 'rarity': w.get('rarity'), 'posFx': w.get('possessionEffectId'),
            'equipFx': w.get('equipmentPossessionEffectId') or w.get('equipEffectIds'), 'sprite': w.get('spriteName')}

data = {
    'characters': [{'id': c['id'], 'asset': c['assetId'], 'main': c['isMain']} for c in characters],
    'costumes': [costume_json(c) for c in costumes],
    'skills': {str(s['id']): skill_json(s) for s in skills},
    'lrvGroups': groups,
    'tags': {str(t['id']): t['tagType'] for t in tags},
    'items': ([item_json(w, 'weapon') for w in weapons] +
              [item_json(a, 'armor') for a in armors] +
              [item_json(a, 'assist') for a in assists] +
              [item_json(t, 'treasure') for t in treasures]),
    'possessionFx': {str(p['id']): {'status': p['statusType'], 'value': p['value'], 'group': p['levelRangeValueGroupId'], 'vt': p['valueType']} for p in posfx},
    'costumePosFx': {str(p['id']): {'fx': p['possessionEffectId'], 'cond': p['evaluateConditionId']} for p in costume_posfx},
    'rarity': {str(r['id']): {'rarity': r['rarity'], 'expGroup': r['experienceGroupId'], 'maxLv': r['initialMaxLevel']} for r in rarity},
    'statusConfig': {str(r['id']): {'label': r['label'], 'value': r['value']} for r in status_cfg},
}

os.makedirs(os.path.dirname(OUT), exist_ok=True)
with open(OUT, 'w', encoding='utf-8') as f:
    f.write('// Chiikawa Pocket datamined dataset v2.4.1 (auto-generated)\n')
    f.write('const DATA = ')
    json.dump(data, f, ensure_ascii=False, separators=(',', ':'))
    f.write(';\n')
print('written', OUT, os.path.getsize(OUT), 'bytes')
print('costumes:', len(data['costumes']), 'skills:', len(data['skills']), 'groups:', len(groups), 'items:', len(data['items']), 'posfx:', len(data['possessionFx']))
